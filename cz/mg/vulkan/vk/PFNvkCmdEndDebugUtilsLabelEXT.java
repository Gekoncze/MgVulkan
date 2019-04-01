package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCmdEndDebugUtilsLabelEXT.html">khronos documentation</a>
 **/
public class PFNvkCmdEndDebugUtilsLabelEXT extends VkFunctionPointer {
    public PFNvkCmdEndDebugUtilsLabelEXT() {
    }

    public PFNvkCmdEndDebugUtilsLabelEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCmdEndDebugUtilsLabelEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCmdEndDebugUtilsLabelEXT(long value) {
        setValue(value);
    }

    public PFNvkCmdEndDebugUtilsLabelEXT(VkInstance instance) {
        super(instance, new VkString("vkCmdEndDebugUtilsLabelEXT"));
    }

    public void call(VkCommandBuffer commandBuffer){
        call(getValue(), commandBuffer != null ? commandBuffer.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long commandBuffer);
}
