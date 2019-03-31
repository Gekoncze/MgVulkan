package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdUpdateBuffer.html">khronos documentation</a>
 **/
public class PFNvkCmdUpdateBuffer extends VkFunctionPointer {
    public PFNvkCmdUpdateBuffer() {
    }

    public PFNvkCmdUpdateBuffer(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdUpdateBuffer(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdUpdateBuffer(long value) {
        setValue(value);
    }

    public PFNvkCmdUpdateBuffer(VkInstance instance) {
        super(instance, new VkString("vkCmdUpdateBuffer"));
    }

    public void call(VkCommandBuffer commandBuffer, VkBuffer dstBuffer, VkDeviceSize dstOffset, VkDeviceSize dataSize, VkObject pData){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkCommandBuffer.NULL.getVkAddress(), dstBuffer != null ? dstBuffer.getVkAddress() : VkBuffer.NULL.getVkAddress(), dstOffset != null ? dstOffset.getVkAddress() : VkPointer.NULL, dataSize != null ? dataSize.getVkAddress() : VkPointer.NULL, pData != null ? pData.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long dstBuffer, long dstOffset, long dataSize, long pData);
}
