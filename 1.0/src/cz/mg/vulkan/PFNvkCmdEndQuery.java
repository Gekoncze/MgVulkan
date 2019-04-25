package cz.mg.vulkan;

public class PFNvkCmdEndQuery extends VkFunctionPointer {
    public PFNvkCmdEndQuery() {
    }

    public PFNvkCmdEndQuery(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdEndQuery(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdEndQuery(long value) {
        setValue(value);
    }

    public PFNvkCmdEndQuery(VkInstance instance) {
        super(instance, new VkString("vkCmdEndQuery"));
    }

    public void call(VkCommandBuffer commandBuffer, VkQueryPool queryPool, VkUInt32 query){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddress(), queryPool != null ? queryPool.getVkAddress() : VkPointer.getNullAddress(), query != null ? query.getVkAddress() : VkPointer.getNullAddress());
    }

    protected static native void call(long vkaddress, long commandBuffer, long queryPool, long query);
}
