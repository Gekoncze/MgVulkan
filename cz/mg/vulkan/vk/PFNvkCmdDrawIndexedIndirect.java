package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdDrawIndexedIndirect.html">khronos documentation</a>
 **/
public class PFNvkCmdDrawIndexedIndirect extends VkFunctionPointer {
    public PFNvkCmdDrawIndexedIndirect() {
    }

    public PFNvkCmdDrawIndexedIndirect(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdDrawIndexedIndirect(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdDrawIndexedIndirect(long value) {
        setValue(value);
    }

    public PFNvkCmdDrawIndexedIndirect(VkInstance instance) {
        super(instance, new VkString("vkCmdDrawIndexedIndirect"));
    }

    public void call(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset, VkUInt32 drawCount, VkUInt32 stride){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, buffer != null ? buffer.getVkAddress() : VkPointer.NULL_ADDRESS, offset != null ? offset.getVkAddress() : VkPointer.NULL_ADDRESS, drawCount != null ? drawCount.getVkAddress() : VkPointer.NULL_ADDRESS, stride != null ? stride.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long commandBuffer, long buffer, long offset, long drawCount, long stride);
}
