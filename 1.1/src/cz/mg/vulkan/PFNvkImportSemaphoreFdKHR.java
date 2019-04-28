package cz.mg.vulkan;

public class PFNvkImportSemaphoreFdKHR extends VkFunctionPointer {
    public PFNvkImportSemaphoreFdKHR() {
    }

    protected PFNvkImportSemaphoreFdKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkImportSemaphoreFdKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkImportSemaphoreFdKHR(long value) {
        setValue(value);
    }

    public PFNvkImportSemaphoreFdKHR(VkInstance instance) {
        super(instance, new VkString("vkImportSemaphoreFdKHR"));
    }

    public void call(VkDevice device, VkImportSemaphoreFdInfoKHR pImportSemaphoreFdInfo, VkResult rval){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pImportSemaphoreFdInfo != null ? pImportSemaphoreFdInfo.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void callNative(long vkaddress, long device, long pImportSemaphoreFdInfo, long rval);


    public int call(VkDevice device, VkImportSemaphoreFdInfoKHR pImportSemaphoreFdInfo){
        return callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pImportSemaphoreFdInfo != null ? pImportSemaphoreFdInfo.getVkAddress() : VkPointer.NULL);
    }

    protected static native int callSimplifiedNative(long vkaddress, long device, long pImportSemaphoreFdInfo);

}
