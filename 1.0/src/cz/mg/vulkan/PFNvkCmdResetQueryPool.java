package cz.mg.vulkan;

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
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), queryPool != null ? queryPool.getVkAddress() : VkPointer.getNullAddressNative(), firstQuery != null ? firstQuery.getVkAddress() : VkPointer.getNullAddressNative(), queryCount != null ? queryCount.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void call(long vkaddress, long commandBuffer, long queryPool, long firstQuery, long queryCount);
}
