package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdResetQueryPool.html">khronos documentation</a>
 **/
public class PFNvkCmdResetQueryPool extends VkFunctionPointer {
    public PFNvkCmdResetQueryPool() {
    }

    public PFNvkCmdResetQueryPool(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdResetQueryPool(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdResetQueryPool(long value) {
        setValue(value);
    }

    public PFNvkCmdResetQueryPool(VkInstance instance) {
        super(instance, new VkString("vkCmdResetQueryPool"));
    }

    public void call(VkCommandBuffer commandBuffer, VkQueryPool queryPool, VkUInt32 firstQuery, VkUInt32 queryCount){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, queryPool != null ? queryPool.getVkAddress() : VkPointer.NULL_ADDRESS, firstQuery != null ? firstQuery.getVkAddress() : VkPointer.NULL_ADDRESS, queryCount != null ? queryCount.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long commandBuffer, long queryPool, long firstQuery, long queryCount);
}
