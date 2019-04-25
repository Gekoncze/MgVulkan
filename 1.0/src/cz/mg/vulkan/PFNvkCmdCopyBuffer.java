package cz.mg.vulkan;

public class PFNvkCmdCopyBuffer extends VkFunctionPointer {
    public PFNvkCmdCopyBuffer() {
    }

    public PFNvkCmdCopyBuffer(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdCopyBuffer(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdCopyBuffer(long value) {
        setValue(value);
    }

    public PFNvkCmdCopyBuffer(VkInstance instance) {
        super(instance, new VkString("vkCmdCopyBuffer"));
    }

    public void call(VkCommandBuffer commandBuffer, VkBuffer srcBuffer, VkBuffer dstBuffer, VkUInt32 regionCount, VkBufferCopy pRegions){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), srcBuffer != null ? srcBuffer.getVkAddress() : VkPointer.getNullAddressNative(), dstBuffer != null ? dstBuffer.getVkAddress() : VkPointer.getNullAddressNative(), regionCount != null ? regionCount.getVkAddress() : VkPointer.getNullAddressNative(), pRegions != null ? pRegions.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long commandBuffer, long srcBuffer, long dstBuffer, long regionCount, long pRegions);
}
