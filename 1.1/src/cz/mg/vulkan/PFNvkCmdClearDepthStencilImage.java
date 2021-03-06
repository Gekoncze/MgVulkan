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

    public void call(VkCommandBuffer commandBuffer, VkImage image, int imageLayout, VkClearDepthStencilValue pDepthStencil, int rangeCount, VkImageSubresourceRange pRanges){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), image != null ? image.getVkAddress() : VkPointer.getNullAddressNative(), imageLayout, pDepthStencil != null ? pDepthStencil.getVkAddress() : VkPointer.NULL, rangeCount, pRanges != null ? pRanges.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long image, int imageLayout, long pDepthStencil, int rangeCount, long pRanges);

}
