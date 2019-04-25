package cz.mg.vulkan;

public class PFNvkCmdClearDepthStencilImage extends VkFunctionPointer {
    public PFNvkCmdClearDepthStencilImage() {
    }

    protected PFNvkCmdClearDepthStencilImage(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdClearDepthStencilImage(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdClearDepthStencilImage(long value) {
        setValue(value);
    }

    public PFNvkCmdClearDepthStencilImage(VkInstance instance) {
        super(instance, new VkString("vkCmdClearDepthStencilImage"));
    }

    public void call(VkCommandBuffer commandBuffer, VkImage image, VkImageLayout imageLayout, VkClearDepthStencilValue pDepthStencil, VkUInt32 rangeCount, VkImageSubresourceRange pRanges){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), image != null ? image.getVkAddress() : VkPointer.getNullAddressNative(), imageLayout != null ? imageLayout.getVkAddress() : VkPointer.getNullAddressNative(), pDepthStencil != null ? pDepthStencil.getVkAddress() : VkPointer.NULL, rangeCount != null ? rangeCount.getVkAddress() : VkPointer.getNullAddressNative(), pRanges != null ? pRanges.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long commandBuffer, long image, long imageLayout, long pDepthStencil, long rangeCount, long pRanges);
}
