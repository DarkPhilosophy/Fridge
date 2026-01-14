package ro.fridge.ui.scanner

import android.content.Context
import com.google.mlkit.vision.barcode.common.Barcode
import com.google.mlkit.vision.codescanner.GmsBarcodeScannerOptions
import com.google.mlkit.vision.codescanner.GmsBarcodeScanning
import kotlinx.coroutines.tasks.await

class BarcodeScanner(context: Context) {
    private val options = GmsBarcodeScannerOptions.Builder()
        .setBarcodeFormats(Barcode.FORMAT_ALL_FORMATS)
        .build()

    private val scanner = GmsBarcodeScanning.getClient(context, options)

    suspend fun startScan(): String? {
        return try {
            val barcode = scanner.startScan().await()
            barcode.rawValue
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
}
