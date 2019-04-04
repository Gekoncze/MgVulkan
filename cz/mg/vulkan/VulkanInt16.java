package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/int16_t.html">khronos documentation</a>
 **/
public class VulkanInt16 extends VulkanObject {
    public VulkanInt16(){
        super(new VkInt16());
    }

    public VulkanInt16(VkInt16 vk){
        super(vk);
    }

    @Override
    public VkInt16 getVk(){
        return (VkInt16) super.getVk();
    }

    public VulkanInt16(short value){
        super(new VkInt16(value));
    }

    public short getValue(){
        return getVk().getValue();
    }

    public void setValue(short value){
        getVk().setValue(value);
    }

    public static class Array extends VulkanInt16 implements cz.mg.collections.array.ReadonlyArray<VulkanInt16> {
        public Array(VkInt16.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkInt16.Array(count));
        }

        public Array(int count, VulkanInt16 o){
            this(new VkInt16.Array(count, o.getVk()));
        }

        @Override
        public VkInt16.Array getVk(){
            return (VkInt16.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanInt16 get(int i){
            return new VulkanInt16(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkInt16.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkInt16.Pointer());
        }

        public Pointer(long value) {
            this(new VkInt16.Pointer(value));
        }

        @Override
        public VkInt16.Pointer getVk(){
            return (VkInt16.Pointer) super.getVk();
        }

        public static class Array extends VulkanInt16.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanInt16.Pointer> {
            public Array(int count) {
                super(new VkInt16.Pointer.Array(count));
            }

            public Array(VulkanInt16[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkInt16.Pointer.Array getVk(){
                return (VkInt16.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanInt16.Pointer get(int i){
                return new VulkanInt16.Pointer(getVk().get(i));
            }
        }
    }
}
