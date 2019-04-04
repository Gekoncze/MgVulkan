package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/float.html">khronos documentation</a>
 **/
public class VulkanFloat extends VulkanObject {
    public VulkanFloat(){
        super(new VkFloat());
    }

    public VulkanFloat(VkFloat vk){
        super(vk);
    }

    @Override
    public VkFloat getVk(){
        return (VkFloat) super.getVk();
    }

    public VulkanFloat(float value){
        super(new VkFloat(value));
    }

    public float getValue(){
        return getVk().getValue();
    }

    public void setValue(float value){
        getVk().setValue(value);
    }

    public static class Array extends VulkanFloat implements cz.mg.collections.array.ReadonlyArray<VulkanFloat> {
        public Array(VkFloat.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkFloat.Array(count));
        }

        public Array(int count, VulkanFloat o){
            this(new VkFloat.Array(count, o.getVk()));
        }

        @Override
        public VkFloat.Array getVk(){
            return (VkFloat.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanFloat get(int i){
            return new VulkanFloat(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkFloat.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkFloat.Pointer());
        }

        public Pointer(long value) {
            this(new VkFloat.Pointer(value));
        }

        @Override
        public VkFloat.Pointer getVk(){
            return (VkFloat.Pointer) super.getVk();
        }

        public static class Array extends VulkanFloat.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanFloat.Pointer> {
            public Array(int count) {
                super(new VkFloat.Pointer.Array(count));
            }

            public Array(VulkanFloat[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkFloat.Pointer.Array getVk(){
                return (VkFloat.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanFloat.Pointer get(int i){
                return new VulkanFloat.Pointer(getVk().get(i));
            }
        }
    }
}
