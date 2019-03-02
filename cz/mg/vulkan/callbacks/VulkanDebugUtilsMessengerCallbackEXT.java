package cz.mg.vulkan.callbacks;

import com.sun.jna.Pointer;
import cz.mg.vulkan.structures.VulkanDebugUtilsMessengerCallbackDataEXT;
import cz.mg.vulkan.flags.VulkanDebugUtilsMessageSeverityFlagsEXT;
import cz.mg.vulkan.flags.VulkanDebugUtilsMessageTypeFlagsEXT;
import cz.mg.vulkan.jna.Vk;
import cz.mg.vulkan.jna.callbacks.PFN_vkDebugUtilsMessengerCallbackEXT;
import cz.mg.vulkan.jna.flags.VkDebugUtilsMessageSeverityFlagsEXT;
import cz.mg.vulkan.jna.flags.VkDebugUtilsMessageTypeFlagsEXT;
import cz.mg.vulkan.jna.structures.VkDebugUtilsMessengerCallbackDataEXT;
import cz.mg.vulkan.jna.types.VkBool32;


public abstract class VulkanDebugUtilsMessengerCallbackEXT {
    private final PFN_vkDebugUtilsMessengerCallbackEXT callback = new PFN_vkDebugUtilsMessengerCallbackEXT() {
        @Override
        public VkBool32 callback(VkDebugUtilsMessageSeverityFlagsEXT.ByValue messageSeverity, VkDebugUtilsMessageTypeFlagsEXT.ByValue messageType, VkDebugUtilsMessengerCallbackDataEXT.ByReference pCallbackData, Pointer pUserData) {
            boolean rval = VulkanDebugUtilsMessengerCallbackEXT.this.callback(
                    new VulkanDebugUtilsMessageSeverityFlagsEXT(messageSeverity),
                    new VulkanDebugUtilsMessageTypeFlagsEXT(messageType),
                    new VulkanDebugUtilsMessengerCallbackDataEXT(pCallbackData),
                    null
            );
            return new VkBool32(rval == false ? Vk.VK_FALSE : Vk.VK_TRUE);
        }
    };

    public PFN_vkDebugUtilsMessengerCallbackEXT getCallback() {
        return callback;
    }

    public abstract boolean callback(VulkanDebugUtilsMessageSeverityFlagsEXT messageSeverity, VulkanDebugUtilsMessageTypeFlagsEXT messageType, VulkanDebugUtilsMessengerCallbackDataEXT pCallbackData, Object pUserData);
}
