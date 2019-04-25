package cz.mg.vulkan;

public class PFNvkCmdUpdateBuffer extends VkFunctionPointer {
    public PFNvkCmdUpdateBuffer() {
    }

    public PFNvkCmdUpdateBuffer(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdUpdateBuffer(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdUpdateBuffer(long value) {
        setValue(value);
    }

    public PFNvkCmdUpdateBuffer(VkInstance instance) {
        super(instance, new VkString("vkCmdUpdateBuffer"));
    }

    public void call(VkCommandBuffer commandBuffer, VkBuffer dstBuffer, VkDeviceSize dstOffset, VkDeviceSize dataSize, VkObject pData){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddress(), dstBuffer != null ? dstBuffer.getVkAddress() : VkPointer.getNullAddress(), dstOffset != null ? dstOffset.getVkAddress() : VkPointer.getNullAddress(), dataSize != null ? dataSize.getVkAddress() : VkPointer.getNullAddress(), pData != null ? pData.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long commandBuffer, long dstBuffer, long dstOffset, long dataSize, long pData);
}
