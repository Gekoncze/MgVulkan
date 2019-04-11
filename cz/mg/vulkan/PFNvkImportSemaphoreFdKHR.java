package cz.mg.vulkan;

public class PFNvkImportSemaphoreFdKHR extends VkFunctionPointer {
    public PFNvkImportSemaphoreFdKHR() {
    }

    public PFNvkImportSemaphoreFdKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkImportSemaphoreFdKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkImportSemaphoreFdKHR(long value) {
        setValue(value);
    }

    public PFNvkImportSemaphoreFdKHR(VkInstance instance) {
        super(instance, new VkString("vkImportSemaphoreFdKHR"));
    }

    public void call(VkDevice device, VkImportSemaphoreFdInfoKHR pImportSemaphoreFdInfo, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), pImportSemaphoreFdInfo != null ? pImportSemaphoreFdInfo.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getNullAddress());
    }

    private static native void call(long vkaddress, long device, long pImportSemaphoreFdInfo, long rval);
}
