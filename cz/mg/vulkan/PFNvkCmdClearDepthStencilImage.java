package cz.mg.vulkan;

public class PFNvkCmdClearDepthStencilImage extends VkFunctionPointer {
    public PFNvkCmdClearDepthStencilImage() {
    }

    public PFNvkCmdClearDepthStencilImage(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdClearDepthStencilImage(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdClearDepthStencilImage(long value) {
        setValue(value);
    }

    public PFNvkCmdClearDepthStencilImage(VkInstance instance) {
        super(instance, new VkString("vkCmdClearDepthStencilImage"));
    }

    public void call(VkCommandBuffer commandBuffer, VkImage image, VkImageLayout imageLayout, VkClearDepthStencilValue pDepthStencil, VkUInt32 rangeCount, VkImageSubresourceRange pRanges){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getSinkAddress(), image != null ? image.getVkAddress() : VkPointer.getSinkAddress(), imageLayout != null ? imageLayout.getVkAddress() : VkPointer.getSinkAddress(), pDepthStencil != null ? pDepthStencil.getVkAddress() : VkPointer.NULL, rangeCount != null ? rangeCount.getVkAddress() : VkPointer.getSinkAddress(), pRanges != null ? pRanges.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long image, long imageLayout, long pDepthStencil, long rangeCount, long pRanges);
}
