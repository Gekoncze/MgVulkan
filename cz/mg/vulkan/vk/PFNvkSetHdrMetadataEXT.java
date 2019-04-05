package cz.mg.vulkan.vk;

public class PFNvkSetHdrMetadataEXT extends VkFunctionPointer {
    public PFNvkSetHdrMetadataEXT() {
    }

    public PFNvkSetHdrMetadataEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkSetHdrMetadataEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkSetHdrMetadataEXT(long value) {
        setValue(value);
    }

    public PFNvkSetHdrMetadataEXT(VkInstance instance) {
        super(instance, new VkString("vkSetHdrMetadataEXT"));
    }

    public void call(VkDevice device, VkUInt32 swapchainCount, VkSwapchainKHR pSwapchains, VkHdrMetadataEXT pMetadata){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, swapchainCount != null ? swapchainCount.getVkAddress() : VkPointer.NULL_ADDRESS, pSwapchains != null ? pSwapchains.getVkAddress() : VkPointer.NULL, pMetadata != null ? pMetadata.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long swapchainCount, long pSwapchains, long pMetadata);
}
