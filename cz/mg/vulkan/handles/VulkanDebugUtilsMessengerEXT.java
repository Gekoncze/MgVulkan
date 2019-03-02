package cz.mg.vulkan.handles;

import cz.mg.vulkan.extensions.VulkanDebugUtilsEXT;
import cz.mg.vulkan.callbacks.VulkanDebugUtilsMessengerCallbackEXT;
import cz.mg.vulkan.flags.VulkanDebugUtilsMessageSeverityFlagsEXT;
import cz.mg.vulkan.flags.VulkanDebugUtilsMessageTypeFlagsEXT;
import cz.mg.vulkan.jna.handles.VkDebugUtilsMessengerEXT;


public class VulkanDebugUtilsMessengerEXT {
    private final VulkanDebugUtilsEXT debugUtils;
    private final VulkanDebugUtilsMessengerCallbackEXT callback;
    public final VkDebugUtilsMessengerEXT.ByValue handle;

    public VulkanDebugUtilsMessengerEXT(VulkanDebugUtilsEXT debugUtils, VulkanDebugUtilsMessageSeverityFlagsEXT messageSeverity, VulkanDebugUtilsMessageTypeFlagsEXT messageTypes, VulkanDebugUtilsMessengerCallbackEXT callback) {
        this.debugUtils = debugUtils;
        this.callback = callback;
        this.handle = this.debugUtils.vkdus.vkCreateDebugUtilsMessengerEXT(this.debugUtils.getInstance().handle, messageSeverity.flags, messageTypes.flags, callback.getCallback(), null);
    }

    public VulkanDebugUtilsEXT getDebugUtils() {
        return debugUtils;
    }

    @Override
    protected void finalize() {
        debugUtils.vkdus.vkDestroyDebugUtilsMessengerEXT(debugUtils.getInstance().handle, handle);
    }
}
