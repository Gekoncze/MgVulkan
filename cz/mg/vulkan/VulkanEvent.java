package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanEvent extends VulkanHandle {
    VulkanEvent(){
        super(new VkEvent());
    }

    VulkanEvent(VkEvent vk){
        super(vk);
    }

    @Override
    public VkEvent getVk(){
        return (VkEvent) super.getVk();
    }




    public static class Array extends VulkanEvent implements cz.mg.collections.array.ReadonlyArray<VulkanEvent> {
        Array(VkEvent.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkEvent.Array(count));
        }

        Array(int count, VulkanEvent o){
            this(new VkEvent.Array(count, o.getVk()));
        }

        @Override
        public VkEvent.Array getVk(){
            return (VkEvent.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanEvent get(int i){
            return new VulkanEvent(getVk().get(i));
        }
    }

}
