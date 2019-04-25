package cz.mg.vulkan;

public class PFNvkImportFenceFdKHR extends VkFunctionPointer {
    public PFNvkImportFenceFdKHR() {
    }

    protected PFNvkImportFenceFdKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkImportFenceFdKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkImportFenceFdKHR(long value) {
        setValue(value);
    }

    public PFNvkImportFenceFdKHR(VkInstance instance) {
        super(instance, new VkString("vkImportFenceFdKHR"));
    }

    public void call(VkDevice device, VkImportFenceFdInfoKHR pImportFenceFdInfo, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), pImportFenceFdInfo != null ? pImportFenceFdInfo.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.getSinkAddressNative());
    }

    protected static native void call(long vkaddress, long device, long pImportFenceFdInfo, long rval);
}
