package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdDrawIndirectCountAMD.html">khronos documentation</a>
 **/
public class PFNvkCmdDrawIndirectCountAMD extends VkFunctionPointer {
    public PFNvkCmdDrawIndirectCountAMD() {
    }

    public PFNvkCmdDrawIndirectCountAMD(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdDrawIndirectCountAMD(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdDrawIndirectCountAMD(long value) {
        setValue(value);
    }

    public PFNvkCmdDrawIndirectCountAMD(VkInstance instance) {
        super(instance, new VkString("vkCmdDrawIndirectCountAMD"));
    }

    public void call(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset, VkBuffer countBuffer, VkDeviceSize countBufferOffset, VkUInt32 maxDrawCount, VkUInt32 stride){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, buffer != null ? buffer.getVkAddress() : VkPointer.NULL_ADDRESS, offset != null ? offset.getVkAddress() : VkPointer.NULL_ADDRESS, countBuffer != null ? countBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, countBufferOffset != null ? countBufferOffset.getVkAddress() : VkPointer.NULL_ADDRESS, maxDrawCount != null ? maxDrawCount.getVkAddress() : VkPointer.NULL_ADDRESS, stride != null ? stride.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long commandBuffer, long buffer, long offset, long countBuffer, long countBufferOffset, long maxDrawCount, long stride);
}
