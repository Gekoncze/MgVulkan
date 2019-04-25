package cz.mg.vulkan;

public class PFNvkCmdDrawIndexedIndirectCountAMD extends VkFunctionPointer {
    public PFNvkCmdDrawIndexedIndirectCountAMD() {
    }

    public PFNvkCmdDrawIndexedIndirectCountAMD(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdDrawIndexedIndirectCountAMD(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdDrawIndexedIndirectCountAMD(long value) {
        setValue(value);
    }

    public PFNvkCmdDrawIndexedIndirectCountAMD(VkInstance instance) {
        super(instance, new VkString("vkCmdDrawIndexedIndirectCountAMD"));
    }

    public void call(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset, VkBuffer countBuffer, VkDeviceSize countBufferOffset, VkUInt32 maxDrawCount, VkUInt32 stride){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), buffer != null ? buffer.getVkAddress() : VkPointer.getNullAddressNative(), offset != null ? offset.getVkAddress() : VkPointer.getNullAddressNative(), countBuffer != null ? countBuffer.getVkAddress() : VkPointer.getNullAddressNative(), countBufferOffset != null ? countBufferOffset.getVkAddress() : VkPointer.getNullAddressNative(), maxDrawCount != null ? maxDrawCount.getVkAddress() : VkPointer.getNullAddressNative(), stride != null ? stride.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void call(long vkaddress, long commandBuffer, long buffer, long offset, long countBuffer, long countBufferOffset, long maxDrawCount, long stride);
}
