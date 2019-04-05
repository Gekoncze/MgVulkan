package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanInstance extends VulkanHandle {
    VulkanInstance(){
        super(new VkInstance());
    }

    VulkanInstance(VkInstance vk){
        super(vk);
    }

    @Override
    public VkInstance getVk(){
        return (VkInstance) super.getVk();
    }




    public static class Array extends VulkanInstance implements cz.mg.collections.array.ReadonlyArray<VulkanInstance> {
        Array(VkInstance.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkInstance.Array(count));
        }

        Array(int count, VulkanInstance o){
            this(new VkInstance.Array(count, o.getVk()));
        }

        @Override
        public VkInstance.Array getVk(){
            return (VkInstance.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanInstance get(int i){
            return new VulkanInstance(getVk().get(i));
        }
    }

}
