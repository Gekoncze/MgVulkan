package cz.mg.vulkan;

public class PFNvkSetHdrMetadataEXT extends VkFunctionPointer {
    public PFNvkSetHdrMetadataEXT() {
    }

    protected PFNvkSetHdrMetadataEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkSetHdrMetadataEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkSetHdrMetadataEXT(long value) {
        setValue(value);
    }

    public PFNvkSetHdrMetadataEXT(VkInstance instance) {
        super(instance, new VkString("vkSetHdrMetadataEXT"));
    }

    public void call(VkDevice device, VkUInt32 swapchainCount, VkSwapchainKHR pSwapchains, VkHdrMetadataEXT pMetadata){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), swapchainCount != null ? swapchainCount.getVkAddress() : VkPointer.getNullAddressNative(), pSwapchains != null ? pSwapchains.getVkAddress() : VkPointer.NULL, pMetadata != null ? pMetadata.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, long swapchainCount, long pSwapchains, long pMetadata);


    public void call(VkDevice device, int swapchainCount, VkSwapchainKHR pSwapchains, VkHdrMetadataEXT pMetadata){
        callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), swapchainCount, pSwapchains != null ? pSwapchains.getVkAddress() : VkPointer.NULL, pMetadata != null ? pMetadata.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callSimplifiedNative(long vkaddress, long device, int swapchainCount, long pSwapchains, long pMetadata);

}
