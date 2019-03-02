package cz.mg.vulkan.handles;

import cz.mg.vulkan.extensions.VulkanDebugUtilsEXT;
import cz.mg.vulkan.callbacks.VulkanDebugUtilsMessengerCallbackEXT;
import cz.mg.vulkan.flags.VulkanDebugUtilsMessageSeverityFlagsEXT;
import cz.mg.vulkan.flags.VulkanDebugUtilsMessageTypeFlagsEXT;
import cz.mg.vulkan.jna.handles.VkDebugUtilsMessengerEXT;


public class VulkanDebugUtilsMessengerEXT {
    private final VulkanDebugUtilsEXT parent;
    public final VkDebugUtilsMessengerEXT.ByValue handle;
    private final VulkanDebugUtilsMessengerCallbackEXT callback;

    public VulkanDebugUtilsMessengerEXT(VulkanDebugUtilsEXT parent, VkDebugUtilsMessengerEXT.ByValue handle, VulkanDebugUtilsMessengerCallbackEXT callback) {
        if(parent == null || handle == null || callback == null) throw new IllegalArgumentException();
        this.parent = parent;
        this.handle = handle;
        this.callback = callback;
    }

    public VulkanDebugUtilsMessengerEXT(VulkanDebugUtilsEXT parent, VulkanDebugUtilsMessageSeverityFlagsEXT messageSeverity, VulkanDebugUtilsMessageTypeFlagsEXT messageTypes, VulkanDebugUtilsMessengerCallbackEXT callback) {
        if(parent == null || messageSeverity == null || messageTypes == null || callback == null) throw new IllegalArgumentException();
        this.parent = parent;
        this.callback = callback;
        this.handle = this.parent.vkdus.vkCreateDebugUtilsMessengerEXT(this.parent.getInstance().handle, messageSeverity.flags, messageTypes.flags, callback.getCallback(), null);
    }

    public VulkanDebugUtilsEXT getParent() {
        return parent;
    }

    @Override
    protected void finalize() {
        parent.vkdus.vkDestroyDebugUtilsMessengerEXT(parent.getInstance().handle, handle);
    }
}
