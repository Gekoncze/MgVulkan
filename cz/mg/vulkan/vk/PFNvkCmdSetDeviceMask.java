package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdSetDeviceMask.html">khronos documentation</a>
 **/
public class PFNvkCmdSetDeviceMask extends VkFunctionPointer {
    public PFNvkCmdSetDeviceMask() {
    }

    public PFNvkCmdSetDeviceMask(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdSetDeviceMask(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdSetDeviceMask(long value) {
        setValue(value);
    }

    public PFNvkCmdSetDeviceMask(VkInstance instance) {
        super(instance, new VkString("vkCmdSetDeviceMask"));
    }

    public void call(VkCommandBuffer commandBuffer, VkUInt32 deviceMask){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkCommandBuffer.NULL.getVkAddress(), deviceMask != null ? deviceMask.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long commandBuffer, long deviceMask);
}
