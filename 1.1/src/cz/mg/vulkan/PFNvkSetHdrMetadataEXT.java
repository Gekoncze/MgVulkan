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
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), swapchainCount != null ? swapchainCount.getVkAddress() : VkPointer.getNullAddressNative(), pSwapchains != null ? pSwapchains.getVkAddress() : VkPointer.NULL, pMetadata != null ? pMetadata.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long device, long swapchainCount, long pSwapchains, long pMetadata);
}
