package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanXYColorEXT extends VulkanObject {
    public VulkanXYColorEXT(){
        super(new VkXYColorEXT());
    }

    public VulkanXYColorEXT(VkXYColorEXT vk){
        super(vk);
    }

    @Override
    public VkXYColorEXT getVk(){
        return (VkXYColorEXT) super.getVk();
    }

    public VulkanXYColorEXT(VulkanFloat x, VulkanFloat y) {
        super(new VkXYColorEXT(x.getVk(), y.getVk()));
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


    public static class Array extends VulkanXYColorEXT implements cz.mg.collections.array.ReadonlyArray<VulkanXYColorEXT> {
        public Array(VkXYColorEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkXYColorEXT.Array(count));
        }

        public Array(int count, VulkanXYColorEXT o){
            this(new VkXYColorEXT.Array(count, o.getVk()));
        }

        @Override
        public VkXYColorEXT.Array getVk(){
            return (VkXYColorEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanXYColorEXT get(int i){
            return new VulkanXYColorEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkXYColorEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkXYColorEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkXYColorEXT.Pointer(value));
        }

        @Override
        public VkXYColorEXT.Pointer getVk(){
            return (VkXYColorEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanXYColorEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanXYColorEXT.Pointer> {
            public Array(int count) {
                super(new VkXYColorEXT.Pointer.Array(count));
            }

            public Array(VulkanXYColorEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkXYColorEXT.Pointer.Array getVk(){
                return (VkXYColorEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanXYColorEXT.Pointer get(int i){
                return new VulkanXYColorEXT.Pointer(getVk().get(i));
            }
        }
    }
}
