package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSampleLocationEXT extends VulkanObject {
    public VulkanSampleLocationEXT(){
        super(new VkSampleLocationEXT());
    }

    public VulkanSampleLocationEXT(VkSampleLocationEXT vk){
        super(vk);
    }

    @Override
    public VkSampleLocationEXT getVk(){
        return (VkSampleLocationEXT) super.getVk();
    }

    public VulkanSampleLocationEXT(VulkanFloat x, VulkanFloat y) {
        super(new VkSampleLocationEXT(x.getVk(), y.getVk()));
    }

    public VulkanFloat getX() {
        return new VulkanFloat(getVk().getX());
    }

    public void setX(VulkanFloat x) {
        getVk().setX(x.getVk());
    }

    public VulkanFloat getY() {
        return new VulkanFloat(getVk().getY());
    }

    public void setY(VulkanFloat y) {
        getVk().setY(y.getVk());
    }


    public static class Array extends VulkanSampleLocationEXT implements cz.mg.collections.array.ReadonlyArray<VulkanSampleLocationEXT> {
        public Array(VkSampleLocationEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSampleLocationEXT.Array(count));
        }

        public Array(int count, VulkanSampleLocationEXT o){
            this(new VkSampleLocationEXT.Array(count, o.getVk()));
        }

        @Override
        public VkSampleLocationEXT.Array getVk(){
            return (VkSampleLocationEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSampleLocationEXT get(int i){
            return new VulkanSampleLocationEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSampleLocationEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSampleLocationEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkSampleLocationEXT.Pointer(value));
        }

        @Override
        public VkSampleLocationEXT.Pointer getVk(){
            return (VkSampleLocationEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanSampleLocationEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSampleLocationEXT.Pointer> {
            public Array(int count) {
                super(new VkSampleLocationEXT.Pointer.Array(count));
            }

            public Array(VulkanSampleLocationEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSampleLocationEXT.Pointer.Array getVk(){
                return (VkSampleLocationEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSampleLocationEXT.Pointer get(int i){
                return new VulkanSampleLocationEXT.Pointer(getVk().get(i));
            }
        }
    }
}
