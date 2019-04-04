package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/char.html">khronos documentation</a>
 **/
public class VulkanChar extends VulkanObject {
    public VulkanChar(){
        super(new VkChar());
    }

    public VulkanChar(VkChar vk){
        super(vk);
    }

    @Override
    public VkChar getVk(){
        return (VkChar) super.getVk();
    }

    public VulkanChar(byte value){
        super(new VkChar(value));
    }

    public byte getValue(){
        return getVk().getValue();
    }

    public void setValue(byte value){
        getVk().setValue(value);
    }

    public static class Array extends VulkanChar implements cz.mg.collections.array.ReadonlyArray<VulkanChar> {
        public Array(VkChar.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkChar.Array(count));
        }

        public Array(int count, VulkanChar o){
            this(new VkChar.Array(count, o.getVk()));
        }

        @Override
        public VkChar.Array getVk(){
            return (VkChar.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanChar get(int i){
            return new VulkanChar(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkChar.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkChar.Pointer());
        }

        public Pointer(long value) {
            this(new VkChar.Pointer(value));
        }

        @Override
        public VkChar.Pointer getVk(){
            return (VkChar.Pointer) super.getVk();
        }

        public static class Array extends VulkanChar.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanChar.Pointer> {
            public Array(int count) {
                super(new VkChar.Pointer.Array(count));
            }

            public Array(VulkanChar[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkChar.Pointer.Array getVk(){
                return (VkChar.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanChar.Pointer get(int i){
                return new VulkanChar.Pointer(getVk().get(i));
            }
        }
    }
}
