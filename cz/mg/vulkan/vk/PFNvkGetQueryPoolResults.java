package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetQueryPoolResults.html">khronos documentation</a>
 **/
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
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, queryPool != null ? queryPool.getVkAddress() : VkPointer.NULL_ADDRESS, firstQuery != null ? firstQuery.getVkAddress() : VkPointer.NULL_ADDRESS, queryCount != null ? queryCount.getVkAddress() : VkPointer.NULL_ADDRESS, dataSize != null ? dataSize.getVkAddress() : VkPointer.NULL_ADDRESS, pData != null ? pData.getVkAddress() : VkPointer.NULL, stride != null ? stride.getVkAddress() : VkPointer.NULL_ADDRESS, flags != null ? flags.getVkAddress() : VkPointer.NULL_ADDRESS, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long queryPool, long firstQuery, long queryCount, long dataSize, long pData, long stride, long flags, long rval);
}
