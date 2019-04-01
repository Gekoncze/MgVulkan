package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdDrawIndirect.html">khronos documentation</a>
 **/
public class PFNvkCmdDrawIndirect extends VkFunctionPointer {
    public PFNvkCmdDrawIndirect() {
    }

    public PFNvkCmdDrawIndirect(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdDrawIndirect(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdDrawIndirect(long value) {
        setValue(value);
    }

    public PFNvkCmdDrawIndirect(VkInstance instance) {
        super(instance, new VkString("vkCmdDrawIndirect"));
    }

    public void call(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset, VkUInt32 drawCount, VkUInt32 stride){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, buffer != null ? buffer.getVkAddress() : VkPointer.NULL_ADDRESS, offset != null ? offset.getVkAddress() : VkPointer.NULL_ADDRESS, drawCount != null ? drawCount.getVkAddress() : VkPointer.NULL_ADDRESS, stride != null ? stride.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long commandBuffer, long buffer, long offset, long drawCount, long stride);
}
