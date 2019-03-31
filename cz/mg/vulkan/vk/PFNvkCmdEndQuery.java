package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdEndQuery.html">khronos documentation</a>
 **/
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
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkCommandBuffer.NULL.getVkAddress(), queryPool != null ? queryPool.getVkAddress() : VkQueryPool.NULL.getVkAddress(), query != null ? query.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long queryPool, long query);
}
