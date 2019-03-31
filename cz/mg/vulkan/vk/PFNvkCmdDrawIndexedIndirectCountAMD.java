package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdDrawIndexedIndirectCountAMD.html">khronos documentation</a>
 **/
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
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkCommandBuffer.NULL.getVkAddress(), buffer != null ? buffer.getVkAddress() : VkBuffer.NULL.getVkAddress(), offset != null ? offset.getVkAddress() : VkPointer.NULL, countBuffer != null ? countBuffer.getVkAddress() : VkBuffer.NULL.getVkAddress(), countBufferOffset != null ? countBufferOffset.getVkAddress() : VkPointer.NULL, maxDrawCount != null ? maxDrawCount.getVkAddress() : VkPointer.NULL, stride != null ? stride.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long buffer, long offset, long countBuffer, long countBufferOffset, long maxDrawCount, long stride);
}
