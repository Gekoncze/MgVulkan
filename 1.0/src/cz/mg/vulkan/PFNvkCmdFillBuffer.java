package cz.mg.vulkan;

public class PFNvkCmdFillBuffer extends VkFunctionPointer {
    public PFNvkCmdFillBuffer() {
    }

    protected PFNvkCmdFillBuffer(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdFillBuffer(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdFillBuffer(long value) {
        setValue(value);
    }

    public PFNvkCmdFillBuffer(VkInstance instance) {
        super(instance, new VkString("vkCmdFillBuffer"));
    }

    public void call(VkCommandBuffer commandBuffer, VkBuffer dstBuffer, VkDeviceSize dstOffset, VkDeviceSize size, VkUInt32 data){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), dstBuffer != null ? dstBuffer.getVkAddress() : VkPointer.getNullAddressNative(), dstOffset != null ? dstOffset.getVkAddress() : VkPointer.getNullAddressNative(), size != null ? size.getVkAddress() : VkPointer.getNullAddressNative(), data != null ? data.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long dstBuffer, long dstOffset, long size, long data);


    public void call(VkCommandBuffer commandBuffer, VkBuffer dstBuffer, long dstOffset, long size, int data){
        callSimplifiedNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), dstBuffer != null ? dstBuffer.getVkAddress() : VkPointer.getNullAddressNative(), dstOffset, size, data);
    }

    protected static native void callSimplifiedNative(long vkaddress, long commandBuffer, long dstBuffer, long dstOffset, long size, int data);

}
