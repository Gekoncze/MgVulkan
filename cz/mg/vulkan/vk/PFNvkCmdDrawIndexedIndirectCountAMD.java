package cz.mg.vulkan.vk;

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
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, buffer != null ? buffer.getVkAddress() : VkPointer.NULL_ADDRESS, offset != null ? offset.getVkAddress() : VkPointer.NULL_ADDRESS, countBuffer != null ? countBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, countBufferOffset != null ? countBufferOffset.getVkAddress() : VkPointer.NULL_ADDRESS, maxDrawCount != null ? maxDrawCount.getVkAddress() : VkPointer.NULL_ADDRESS, stride != null ? stride.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long commandBuffer, long buffer, long offset, long countBuffer, long countBufferOffset, long maxDrawCount, long stride);
}
