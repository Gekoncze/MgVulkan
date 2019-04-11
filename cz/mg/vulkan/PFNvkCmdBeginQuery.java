package cz.mg.vulkan;

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
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddress(), queryPool != null ? queryPool.getVkAddress() : VkPointer.getNullAddress(), query != null ? query.getVkAddress() : VkPointer.getNullAddress(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddress());
    }

    private static native void call(long vkaddress, long commandBuffer, long queryPool, long query, long flags);
}
