package cz.mg.vulkan;

public class PFNvkCmdClearColorImage extends VkFunctionPointer {
    public PFNvkCmdClearColorImage() {
    }

    protected PFNvkCmdClearColorImage(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdClearColorImage(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdClearColorImage(long value) {
        setValue(value);
    }

    public PFNvkCmdClearColorImage(VkInstance instance) {
        super(instance, new VkString("vkCmdClearColorImage"));
    }

    public void call(VkCommandBuffer commandBuffer, VkImage image, VkImageLayout imageLayout, VkClearColorValue pColor, VkUInt32 rangeCount, VkImageSubresourceRange pRanges){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), image != null ? image.getVkAddress() : VkPointer.getNullAddressNative(), imageLayout != null ? imageLayout.getVkAddress() : VkPointer.getNullAddressNative(), pColor != null ? pColor.getVkAddress() : VkPointer.NULL, rangeCount != null ? rangeCount.getVkAddress() : VkPointer.getNullAddressNative(), pRanges != null ? pRanges.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long image, long imageLayout, long pColor, long rangeCount, long pRanges);


    public void call(VkCommandBuffer commandBuffer, VkImage image, int imageLayout, VkClearColorValue pColor, int rangeCount, VkImageSubresourceRange pRanges){
        callSimplifiedNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), image != null ? image.getVkAddress() : VkPointer.getNullAddressNative(), imageLayout, pColor != null ? pColor.getVkAddress() : VkPointer.NULL, rangeCount, pRanges != null ? pRanges.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callSimplifiedNative(long vkaddress, long commandBuffer, long image, int imageLayout, long pColor, int rangeCount, long pRanges);

}
