package cz.mg.vulkan;

public class PFNvkCmdBeginQuery extends VkFunctionPointer {
    public PFNvkCmdBeginQuery() {
    }

    protected PFNvkCmdBeginQuery(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdBeginQuery(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdBeginQuery(long value) {
        setValue(value);
    }

    public PFNvkCmdBeginQuery(VkInstance instance) {
        super(instance, new VkString("vkCmdBeginQuery"));
    }

    public void call(VkCommandBuffer commandBuffer, VkQueryPool queryPool, VkUInt32 query, VkQueryControlFlags flags){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), queryPool != null ? queryPool.getVkAddress() : VkPointer.getNullAddressNative(), query != null ? query.getVkAddress() : VkPointer.getNullAddressNative(), flags != null ? flags.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long queryPool, long query, long flags);


    public void call(VkCommandBuffer commandBuffer, VkQueryPool queryPool, int query, int flags){
        callSimplifiedNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), queryPool != null ? queryPool.getVkAddress() : VkPointer.getNullAddressNative(), query, flags);
    }

    protected static native void callSimplifiedNative(long vkaddress, long commandBuffer, long queryPool, int query, int flags);

}
