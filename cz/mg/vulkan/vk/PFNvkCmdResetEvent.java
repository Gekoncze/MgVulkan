package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdResetEvent.html">khronos documentation</a>
 **/
public class PFNvkCmdResetEvent extends VkFunctionPointer {
    public PFNvkCmdResetEvent() {
    }

    public PFNvkCmdResetEvent(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdResetEvent(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdResetEvent(long value) {
        setValue(value);
    }

    public PFNvkCmdResetEvent(VkInstance instance) {
        super(instance, new VkString("vkCmdResetEvent"));
    }

    public void call(VkCommandBuffer commandBuffer, VkEvent event, VkPipelineStageFlags stageMask){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.NULL_ADDRESS, event != null ? event.getVkAddress() : VkPointer.NULL_ADDRESS, stageMask != null ? stageMask.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long commandBuffer, long event, long stageMask);
}
