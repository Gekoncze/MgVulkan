package cz.mg.vulkan.vk;

public class PFNvkCmdClearColorImage extends VkFunctionPointer {
    public PFNvkCmdClearColorImage() {
    }

    public PFNvkCmdClearColorImage(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdClearColorImage(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdClearColorImage(long value) {
        setValue(value);
    }

    public PFNvkCmdClearColorImage(VkInstance instance) {
        super(instance, new VkString("vkCmdClearColorImage"));
    }

    public void call(VkCommandBuffer commandBuffer, VkImage image, VkImageLayout imageLayout, VkClearColorValue pColor, VkUInt32 rangeCount, VkImageSubresourceRange pRanges){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, image != null ? image.getVkAddress() : VkPointer.NULL_ADDRESS, imageLayout != null ? imageLayout.getVkAddress() : VkPointer.NULL_ADDRESS, pColor != null ? pColor.getVkAddress() : VkPointer.NULL, rangeCount != null ? rangeCount.getVkAddress() : VkPointer.NULL_ADDRESS, pRanges != null ? pRanges.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long image, long imageLayout, long pColor, long rangeCount, long pRanges);
}
