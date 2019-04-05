package cz.mg.vulkan.vk;

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
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, queryPool != null ? queryPool.getVkAddress() : VkPointer.NULL_ADDRESS, query != null ? query.getVkAddress() : VkPointer.NULL_ADDRESS, flags != null ? flags.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long commandBuffer, long queryPool, long query, long flags);
}
