package cz.mg.vulkan;

public class PFNvkCmdResetQueryPool extends VkFunctionPointer {
    public PFNvkCmdResetQueryPool() {
    }

    protected PFNvkCmdResetQueryPool(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdResetQueryPool(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdResetQueryPool(long value) {
        setValue(value);
    }

    public PFNvkCmdResetQueryPool(VkInstance instance) {
        super(instance, new VkString("vkCmdResetQueryPool"));
    }

    public void call(VkCommandBuffer commandBuffer, VkQueryPool queryPool, VkUInt32 firstQuery, VkUInt32 queryCount){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), queryPool != null ? queryPool.getVkAddress() : VkPointer.getNullAddressNative(), firstQuery != null ? firstQuery.getVkAddress() : VkPointer.getNullAddressNative(), queryCount != null ? queryCount.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long queryPool, long firstQuery, long queryCount);


    public void call(VkCommandBuffer commandBuffer, VkQueryPool queryPool, int firstQuery, int queryCount){
        callSimplifiedNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), queryPool != null ? queryPool.getVkAddress() : VkPointer.getNullAddressNative(), firstQuery, queryCount);
    }

    protected static native void callSimplifiedNative(long vkaddress, long commandBuffer, long queryPool, int firstQuery, int queryCount);

}
