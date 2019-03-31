package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdFillBuffer.html">khronos documentation</a>
 **/
public class PFNvkCmdFillBuffer extends VkFunctionPointer {
    public PFNvkCmdFillBuffer() {
    }

    public PFNvkCmdFillBuffer(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdFillBuffer(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdFillBuffer(long value) {
        setValue(value);
    }

    public PFNvkCmdFillBuffer(VkInstance instance) {
        super(instance, new VkString("vkCmdFillBuffer"));
    }

    public void call(VkCommandBuffer commandBuffer, VkBuffer dstBuffer, VkDeviceSize dstOffset, VkDeviceSize size, VkUInt32 data){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkCommandBuffer.NULL.getVkAddress(), dstBuffer != null ? dstBuffer.getVkAddress() : VkBuffer.NULL.getVkAddress(), dstOffset != null ? dstOffset.getVkAddress() : VkPointer.NULL, size != null ? size.getVkAddress() : VkPointer.NULL, data != null ? data.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long dstBuffer, long dstOffset, long size, long data);
}
