package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanBufferView extends VulkanHandle {
    VulkanBufferView(){
        super(new VkBufferView());
    }

    VulkanBufferView(VkBufferView vk){
        super(vk);
    }

    @Override
    public VkBufferView getVk(){
        return (VkBufferView) super.getVk();
    }




    public static class Array extends VulkanBufferView implements cz.mg.collections.array.ReadonlyArray<VulkanBufferView> {
        Array(VkBufferView.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkBufferView.Array(count));
        }

        Array(int count, VulkanBufferView o){
            this(new VkBufferView.Array(count, o.getVk()));
        }

        @Override
        public VkBufferView.Array getVk(){
            return (VkBufferView.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanBufferView get(int i){
            return new VulkanBufferView(getVk().get(i));
        }
    }

}
