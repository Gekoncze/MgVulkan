package cz.mg.vulkan;

public class PFNvkCmdUpdateBuffer extends VkFunctionPointer {
    public PFNvkCmdUpdateBuffer() {
    }

    protected PFNvkCmdUpdateBuffer(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdUpdateBuffer(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdUpdateBuffer(long value) {
        setValue(value);
    }

    public PFNvkCmdUpdateBuffer(VkInstance instance) {
        super(instance, new VkString("vkCmdUpdateBuffer"));
    }

    public void call(VkCommandBuffer commandBuffer, VkBuffer dstBuffer, VkDeviceSize dstOffset, VkDeviceSize dataSize, VkObject pData){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), dstBuffer != null ? dstBuffer.getVkAddress() : VkPointer.getNullAddressNative(), dstOffset != null ? dstOffset.getVkAddress() : VkPointer.getNullAddressNative(), dataSize != null ? dataSize.getVkAddress() : VkPointer.getNullAddressNative(), pData != null ? pData.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long dstBuffer, long dstOffset, long dataSize, long pData);


    public void call(VkCommandBuffer commandBuffer, VkBuffer dstBuffer, long dstOffset, long dataSize, VkObject pData){
        callSimplifiedNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), dstBuffer != null ? dstBuffer.getVkAddress() : VkPointer.getNullAddressNative(), dstOffset, dataSize, pData != null ? pData.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callSimplifiedNative(long vkaddress, long commandBuffer, long dstBuffer, long dstOffset, long dataSize, long pData);

}
