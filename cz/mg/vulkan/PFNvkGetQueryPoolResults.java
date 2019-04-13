package cz.mg.vulkan;

public class PFNvkGetQueryPoolResults extends VkFunctionPointer {
    public PFNvkGetQueryPoolResults() {
    }

    public PFNvkGetQueryPoolResults(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetQueryPoolResults(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkGetQueryPoolResults(long value) {
        setValue(value);
    }

    public PFNvkGetQueryPoolResults(VkInstance instance) {
        super(instance, new VkString("vkGetQueryPoolResults"));
    }

    public void call(VkDevice device, VkQueryPool queryPool, VkUInt32 firstQuery, VkUInt32 queryCount, VkSize dataSize, VkObject pData, VkDeviceSize stride, VkQueryResultFlags flags, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getSinkAddress(), queryPool != null ? queryPool.getVkAddress() : VkPointer.getSinkAddress(), firstQuery != null ? firstQuery.getVkAddress() : VkPointer.getSinkAddress(), queryCount != null ? queryCount.getVkAddress() : VkPointer.getSinkAddress(), dataSize != null ? dataSize.getVkAddress() : VkPointer.getSinkAddress(), pData != null ? pData.getVkAddress() : VkPointer.NULL, stride != null ? stride.getVkAddress() : VkPointer.getSinkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getSinkAddress(), rval != null ? rval.getVkAddress() : VkPointer.getSinkAddress());
    }

    private static native void call(long vkaddress, long device, long queryPool, long firstQuery, long queryCount, long dataSize, long pData, long stride, long flags, long rval);
}
