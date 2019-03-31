package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdBeginQuery.html">khronos documentation</a>
 **/
public class PFNvkCmdBeginQuery extends VkFunctionPointer {
    public PFNvkCmdBeginQuery() {
    }

    public PFNvkCmdBeginQuery(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdBeginQuery(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdBeginQuery(long value) {
        setValue(value);
    }

    public PFNvkCmdBeginQuery(VkInstance instance) {
        super(instance, new VkString("vkCmdBeginQuery"));
    }

    public void call(VkCommandBuffer commandBuffer, VkQueryPool queryPool, VkUInt32 query, VkQueryControlFlags flags){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkCommandBuffer.NULL.getVkAddress(), queryPool != null ? queryPool.getVkAddress() : VkQueryPool.NULL.getVkAddress(), query != null ? query.getVkAddress() : VkPointer.NULL, flags != null ? flags.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long queryPool, long query, long flags);
}
