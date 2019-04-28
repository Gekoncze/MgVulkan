package cz.mg.vulkan;

public class PFNvkCmdCopyImageToBuffer extends VkFunctionPointer {
    public PFNvkCmdCopyImageToBuffer() {
    }

    protected PFNvkCmdCopyImageToBuffer(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdCopyImageToBuffer(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdCopyImageToBuffer(long value) {
        setValue(value);
    }

    public PFNvkCmdCopyImageToBuffer(VkInstance instance) {
        super(instance, new VkString("vkCmdCopyImageToBuffer"));
    }

    public void call(VkCommandBuffer commandBuffer, VkImage srcImage, int srcImageLayout, VkBuffer dstBuffer, int regionCount, VkBufferImageCopy pRegions){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), srcImage != null ? srcImage.getVkAddress() : VkPointer.getNullAddressNative(), srcImageLayout, dstBuffer != null ? dstBuffer.getVkAddress() : VkPointer.getNullAddressNative(), regionCount, pRegions != null ? pRegions.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long srcImage, int srcImageLayout, long dstBuffer, int regionCount, long pRegions);

}
