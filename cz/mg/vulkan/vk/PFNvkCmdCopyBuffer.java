package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdCopyBuffer.html">khronos documentation</a>
 **/
public class PFNvkCmdCopyBuffer extends VkFunctionPointer {
    public PFNvkCmdCopyBuffer() {
    }

    public PFNvkCmdCopyBuffer(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdCopyBuffer(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdCopyBuffer(long value) {
        setValue(value);
    }

    public PFNvkCmdCopyBuffer(VkInstance instance) {
        super(instance, new VkString("vkCmdCopyBuffer"));
    }

    public void call(VkCommandBuffer commandBuffer, VkBuffer srcBuffer, VkBuffer dstBuffer, VkUInt32 regionCount, VkBufferCopy pRegions){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkCommandBuffer.NULL.getVkAddress(), srcBuffer != null ? srcBuffer.getVkAddress() : VkBuffer.NULL.getVkAddress(), dstBuffer != null ? dstBuffer.getVkAddress() : VkBuffer.NULL.getVkAddress(), regionCount != null ? regionCount.getVkAddress() : VkPointer.NULL, pRegions != null ? pRegions.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long srcBuffer, long dstBuffer, long regionCount, long pRegions);
}
