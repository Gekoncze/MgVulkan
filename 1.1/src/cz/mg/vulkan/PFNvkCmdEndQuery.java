package cz.mg.vulkan;

public class PFNvkCmdEndQuery extends VkFunctionPointer {
    public PFNvkCmdEndQuery() {
    }

    protected PFNvkCmdEndQuery(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkCmdEndQuery(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkCmdEndQuery(long value) {
        setValue(value);
    }

    public PFNvkCmdEndQuery(VkInstance instance) {
        super(instance, new VkString("vkCmdEndQuery"));
    }

    public void call(VkCommandBuffer commandBuffer, VkQueryPool queryPool, VkUInt32 query){
        callNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), queryPool != null ? queryPool.getVkAddress() : VkPointer.getNullAddressNative(), query != null ? query.getVkAddress() : VkPointer.getNullAddressNative());
    }

    protected static native void callNative(long vkaddress, long commandBuffer, long queryPool, long query);


    public void call(VkCommandBuffer commandBuffer, VkQueryPool queryPool, int query){
        callSimplifiedNative(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.getNullAddressNative(), queryPool != null ? queryPool.getVkAddress() : VkPointer.getNullAddressNative(), query);
    }

    protected static native void callSimplifiedNative(long vkaddress, long commandBuffer, long queryPool, int query);

}
