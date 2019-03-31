package cz.mg.vulkan.vk;

import cz.mg.resourcemanager.ResourceManager;

public class VkResourceManager extends ResourceManager {
    private static VkResourceManager instance = null;

    public static VkResourceManager getInstance() {
        if(instance == null) instance = new VkResourceManager();
        return instance;
    }
}
