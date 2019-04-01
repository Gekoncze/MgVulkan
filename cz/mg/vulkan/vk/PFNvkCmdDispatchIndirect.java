package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdDispatchIndirect.html">khronos documentation</a>
 **/
public class PFNvkCmdDispatchIndirect extends VkFunctionPointer {
    public PFNvkCmdDispatchIndirect() {
    }

    public PFNvkCmdDispatchIndirect(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdDispatchIndirect(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdDispatchIndirect(long value) {
        setValue(value);
    }

    public PFNvkCmdDispatchIndirect(VkInstance instance) {
        super(instance, new VkString("vkCmdDispatchIndirect"));
    }

    public void call(VkCommandBuffer commandBuffer, VkBuffer buffer, VkDeviceSize offset){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, buffer != null ? buffer.getVkAddress() : VkPointer.NULL_ADDRESS, offset != null ? offset.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long commandBuffer, long buffer, long offset);
}
